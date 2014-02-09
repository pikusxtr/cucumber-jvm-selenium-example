package com.client;



/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */


        import java.io.IOException;
        import java.io.InputStream;
        import java.io.OutputStream;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.List;
        import java.io.File;
        import org.apache.commons.io.FileUtils;
        import org.apache.http.entity.FileEntity;
        import org.apache.http.entity.ContentType;
        import org.apache.http.HttpEntity;
        import org.apache.http.NameValuePair;
        import org.apache.http.client.entity.UrlEncodedFormEntity;
        import org.apache.http.client.methods.CloseableHttpResponse;
        import org.apache.http.client.methods.HttpGet;
        import org.apache.http.client.methods.HttpPost;
        import org.apache.http.impl.client.CloseableHttpClient;
        import org.apache.http.impl.client.HttpClients;
        import org.apache.http.message.BasicNameValuePair;
        import org.apache.http.util.EntityUtils;

public class SoapClientApache {

    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpGet = new HttpGet("http://google.com/");
            CloseableHttpResponse response1 = httpclient.execute(httpGet);
            // The underlying HTTP connection is still held by the response object
            // to allow the response content to be streamed directly from the network socket.
            // In order to ensure correct deallocation of system resources
            // the user MUST either fully consume the response content  or abort request
            // execution by calling CloseableHttpResponse#close().

            try {
                System.out.println("Response for http get");
                System.out.println(response1.getStatusLine());
                HttpEntity entity1 = response1.getEntity();
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity1);
            } finally {
                response1.close();
            }


            File file = new File("temConvertRq.xml");
            File fileOutXml = new File("temConvertRs.xml");
            fileOutXml.createNewFile();

            System.out.println("Before file entity");
            FileEntity entity = new FileEntity(file, ContentType.create("text/xml", "UTF-8"));

            System.out.println("Before http post");
            HttpPost httpPost = new HttpPost("http://www.w3schools.com/webservices/tempconvert.asmx");

            httpPost.setEntity(entity);
            System.out.println("Entity set");
            //Add headers
            httpPost.addHeader("SOAPAction", "http://www.w3schools.com/webservices/CelsiusToFahrenheit");
            httpPost.addHeader("Host", "www.w3schools.com");
            httpPost.addHeader("Content-Type", "text/xml; charset=utf-8");
            //httpPost.addHeader("Content-Length", "length");

            System.out.println("after headers added");
            CloseableHttpResponse response2 = httpclient.execute(httpPost);

            try {
                System.out.println("before getting the response status");
                System.out.println("Response Status= " +response2.getStatusLine());
                HttpEntity entity2 = response2.getEntity();
                String outXml = EntityUtils.toString(entity2);
                System.out.println("XMl Response!!!!!!!!! = " + outXml);

//                entity2.writeTo(System.out);

                //System.out.println("R
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity2);



                FileUtils.writeStringToFile(fileOutXml, outXml, "UTF-8");

            } finally {
                response2.close();
            }
        } finally {
            httpclient.close();
        }
    }

}
package com.apiipa.apiipa.Domain;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "apis-core")
public class Api {

    @Id
    @Field
    private String id;

    @Field
    private String name;

    @Field
    private String url;

    public Api() {

    }

    public Api(String id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }
}

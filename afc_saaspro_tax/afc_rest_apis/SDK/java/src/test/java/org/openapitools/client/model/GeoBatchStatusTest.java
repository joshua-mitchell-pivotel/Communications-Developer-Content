/*
 * SaasPro
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.GeoBatchDownloadResponse;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for GeoBatchStatus
 */
public class GeoBatchStatusTest {
    private final GeoBatchStatus model = new GeoBatchStatus();

    /**
     * Model tests for GeoBatchStatus
     */
    @Test
    public void testGeoBatchStatus() {
        // TODO: test GeoBatchStatus
    }

    /**
     * Test the property 'processId'
     */
    @Test
    public void processIdTest() {
        // TODO: test processId
    }

    /**
     * Test the property 'requestDate'
     */
    @Test
    public void requestDateTest() {
        // TODO: test requestDate
    }

    /**
     * Test the property 'processingStart'
     */
    @Test
    public void processingStartTest() {
        // TODO: test processingStart
    }

    /**
     * Test the property 'processingEnd'
     */
    @Test
    public void processingEndTest() {
        // TODO: test processingEnd
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'downloads'
     */
    @Test
    public void downloadsTest() {
        // TODO: test downloads
    }

    /**
     * Test the property 'error'
     */
    @Test
    public void errorTest() {
        // TODO: test error
    }

}

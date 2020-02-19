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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.SetTaxCalculationSettingRequest;
import org.openapitools.client.model.TaxCalculationSettingTypes;
import org.openapitools.client.model.TaxCalculationSettingsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomizationApi
 */
@Ignore
public class CustomizationApiTest {

    private final CustomizationApi api = new CustomizationApi();

    
    /**
     * Retrieves one or more profiles with associated settings and configurable items
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV2ProfilesGetProfilesGetTest() throws ApiException {
        Integer requestedClientId = null;
        Integer requestedProfileId = null;
        TaxCalculationSettingTypes itemType = null;
        TaxCalculationSettingsResponse response = api.apiV2ProfilesGetProfilesGet(requestedClientId, requestedProfileId, itemType);

        // TODO: test validations
    }
    
    /**
     * Creates or updates bundle packages and associated profile mappings.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV2ProfilesSetBundlesPostTest() throws ApiException {
        SetTaxCalculationSettingRequest setTaxCalculationSettingRequest = null;
        TaxCalculationSettingsResponse response = api.apiV2ProfilesSetBundlesPost(setTaxCalculationSettingRequest);

        // TODO: test validations
    }
    
    /**
     * Creates or updates configuration settings and associated profile mappings.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV2ProfilesSetConfigPostTest() throws ApiException {
        SetTaxCalculationSettingRequest setTaxCalculationSettingRequest = null;
        TaxCalculationSettingsResponse response = api.apiV2ProfilesSetConfigPost(setTaxCalculationSettingRequest);

        // TODO: test validations
    }
    
    /**
     * Creates or updates exclusions and associated profile mappings.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV2ProfilesSetExclusionsPostTest() throws ApiException {
        SetTaxCalculationSettingRequest setTaxCalculationSettingRequest = null;
        TaxCalculationSettingsResponse response = api.apiV2ProfilesSetExclusionsPost(setTaxCalculationSettingRequest);

        // TODO: test validations
    }
    
    /**
     * Creates or updates overrides and associated profile mappings.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV2ProfilesSetOverridesPostTest() throws ApiException {
        SetTaxCalculationSettingRequest setTaxCalculationSettingRequest = null;
        TaxCalculationSettingsResponse response = api.apiV2ProfilesSetOverridesPost(setTaxCalculationSettingRequest);

        // TODO: test validations
    }
    
}

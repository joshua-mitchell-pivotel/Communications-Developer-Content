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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CalcTaxesRequest;
import org.openapitools.client.model.CalcTaxesResponse;
import org.openapitools.client.model.CommitRequest;
import org.openapitools.client.model.CommitResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxCalculationApi {
    private ApiClient localVarApiClient;

    public TaxCalculationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaxCalculationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for apiV2AfcCalcTaxesPost
     * @param calcTaxesRequest CalcTaxesRequest object containing invoices to process and data required               for performing tax calculations. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AfcCalcTaxesPostCall(CalcTaxesRequest calcTaxesRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = calcTaxesRequest;

        // create path and map variables
        String localVarPath = "/api/v2/afc/CalcTaxes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2AfcCalcTaxesPostValidateBeforeCall(CalcTaxesRequest calcTaxesRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2AfcCalcTaxesPostCall(calcTaxesRequest, _callback);
        return localVarCall;

    }

    /**
     * Performs tax calculations on all invoices and line items within the request body.
     * 
     * @param calcTaxesRequest CalcTaxesRequest object containing invoices to process and data required               for performing tax calculations. (optional)
     * @return CalcTaxesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CalcTaxesResponse apiV2AfcCalcTaxesPost(CalcTaxesRequest calcTaxesRequest) throws ApiException {
        ApiResponse<CalcTaxesResponse> localVarResp = apiV2AfcCalcTaxesPostWithHttpInfo(calcTaxesRequest);
        return localVarResp.getData();
    }

    /**
     * Performs tax calculations on all invoices and line items within the request body.
     * 
     * @param calcTaxesRequest CalcTaxesRequest object containing invoices to process and data required               for performing tax calculations. (optional)
     * @return ApiResponse&lt;CalcTaxesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CalcTaxesResponse> apiV2AfcCalcTaxesPostWithHttpInfo(CalcTaxesRequest calcTaxesRequest) throws ApiException {
        okhttp3.Call localVarCall = apiV2AfcCalcTaxesPostValidateBeforeCall(calcTaxesRequest, null);
        Type localVarReturnType = new TypeToken<CalcTaxesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Performs tax calculations on all invoices and line items within the request body. (asynchronously)
     * 
     * @param calcTaxesRequest CalcTaxesRequest object containing invoices to process and data required               for performing tax calculations. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AfcCalcTaxesPostAsync(CalcTaxesRequest calcTaxesRequest, final ApiCallback<CalcTaxesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2AfcCalcTaxesPostValidateBeforeCall(calcTaxesRequest, _callback);
        Type localVarReturnType = new TypeToken<CalcTaxesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2AfcCommitPost
     * @param commitRequest CommitRequest object containing document code and optional field data to override in reports. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AfcCommitPostCall(CommitRequest commitRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = commitRequest;

        // create path and map variables
        String localVarPath = "/api/v2/afc/Commit";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Basic" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2AfcCommitPostValidateBeforeCall(CommitRequest commitRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2AfcCommitPostCall(commitRequest, _callback);
        return localVarCall;

    }

    /**
     * Commits or un-commits a document code.
     * 
     * @param commitRequest CommitRequest object containing document code and optional field data to override in reports. (optional)
     * @return CommitResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CommitResponse apiV2AfcCommitPost(CommitRequest commitRequest) throws ApiException {
        ApiResponse<CommitResponse> localVarResp = apiV2AfcCommitPostWithHttpInfo(commitRequest);
        return localVarResp.getData();
    }

    /**
     * Commits or un-commits a document code.
     * 
     * @param commitRequest CommitRequest object containing document code and optional field data to override in reports. (optional)
     * @return ApiResponse&lt;CommitResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CommitResponse> apiV2AfcCommitPostWithHttpInfo(CommitRequest commitRequest) throws ApiException {
        okhttp3.Call localVarCall = apiV2AfcCommitPostValidateBeforeCall(commitRequest, null);
        Type localVarReturnType = new TypeToken<CommitResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Commits or un-commits a document code. (asynchronously)
     * 
     * @param commitRequest CommitRequest object containing document code and optional field data to override in reports. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2AfcCommitPostAsync(CommitRequest commitRequest, final ApiCallback<CommitResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2AfcCommitPostValidateBeforeCall(commitRequest, _callback);
        Type localVarReturnType = new TypeToken<CommitResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

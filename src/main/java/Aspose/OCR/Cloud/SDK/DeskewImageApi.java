/*
 * Aspose OCR Cloud 5.0 API
 * Aspose OCR Cloud 5.0 API
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Aspose.OCR.Cloud.SDK;

import Aspose.OCR.Cloud.SDK.ApiCallback;
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.ApiResponse;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.Pair;
import Aspose.OCR.Cloud.SDK.ProgressRequestBody;
import Aspose.OCR.Cloud.SDK.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import Aspose.OCR.Cloud.SDK.model.OCRDeskewImageBody;
import Aspose.OCR.Cloud.SDK.model.OCRResponse;
import Aspose.OCR.Cloud.SDK.model.ProblemDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;
import java.util.regex.Pattern;

public class DeskewImageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DeskewImageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeskewImageApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public DeskewImageApi(String clientId, String clientSecret) {
        this(new ApiClient(clientId, clientSecret, null));
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for cancelDeskewImage
     * @param id  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelDeskewImageCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = getAdjustedPath("/v5.0/ocr/DeskewImage");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelDeskewImageValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling cancelDeskewImage(Async)");
        }

        return cancelDeskewImageCall(id, _callback);

    }

    /**
     * CancelDeskewImage
     * 
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void cancelDeskewImage(String id) throws ApiException {
        cancelDeskewImageWithHttpInfo(id);
    }

    /**
     * CancelDeskewImage
     * 
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> cancelDeskewImageWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = cancelDeskewImageValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * CancelDeskewImage (asynchronously)
     * 
     * @param id  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelDeskewImageAsync(String id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelDeskewImageValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDeskewImage
     * @param id Task id to select the result (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDeskewImageCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = getAdjustedPath("/v5.0/ocr/DeskewImage");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDeskewImageValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDeskewImage(Async)");
        }

        return getDeskewImageCall(id, _callback);

    }

    /**
     * GetDeskewImage
     * 
     * @param id Task id to select the result (required)
     * @return OCRResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public OCRResponse getDeskewImage(String id) throws ApiException {
        ApiResponse<OCRResponse> localVarResp = getDeskewImageWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * GetDeskewImage
     * 
     * @param id Task id to select the result (required)
     * @return ApiResponse&lt;OCRResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OCRResponse> getDeskewImageWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getDeskewImageValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<OCRResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetDeskewImage (asynchronously)
     * 
     * @param id Task id to select the result (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDeskewImageAsync(String id, final ApiCallback<OCRResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDeskewImageValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<OCRResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postDeskewImage
     * @param ocRDeskewImageBody  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postDeskewImageCall(OCRDeskewImageBody ocRDeskewImageBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = ocRDeskewImageBody;

        // create path and map variables
        String localVarPath = getAdjustedPath("/v5.0/ocr/DeskewImage");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postDeskewImageValidateBeforeCall(OCRDeskewImageBody ocRDeskewImageBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'ocRDeskewImageBody' is set
        if (ocRDeskewImageBody == null) {
            throw new ApiException("Missing the required parameter 'ocRDeskewImageBody' when calling postDeskewImage(Async)");
        }

        return postDeskewImageCall(ocRDeskewImageBody, _callback);

    }

    /**
     * PostDeskewImage
     * 
     * @param ocRDeskewImageBody  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public String postDeskewImage(OCRDeskewImageBody ocRDeskewImageBody) throws ApiException {
        ApiResponse<String> localVarResp = postDeskewImageWithHttpInfo(ocRDeskewImageBody);
        return localVarResp.getData();
    }

    /**
     * PostDeskewImage
     * 
     * @param ocRDeskewImageBody  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> postDeskewImageWithHttpInfo(OCRDeskewImageBody ocRDeskewImageBody) throws ApiException {
        okhttp3.Call localVarCall = postDeskewImageValidateBeforeCall(ocRDeskewImageBody, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * PostDeskewImage (asynchronously)
     * 
     * @param ocRDeskewImageBody  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postDeskewImageAsync(OCRDeskewImageBody ocRDeskewImageBody, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = postDeskewImageValidateBeforeCall(ocRDeskewImageBody, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    
  /**
    * Returns adjusted path in case if base path contains version identifier
    *
    * @param  srcPath
    * @return Path to controller

  **/
  private String getAdjustedPath(String srcPath)
  {
    if ("https://api.aspose.cloud/v5.0/ocr".equals(this.localVarApiClient.getBasePath())) {
            Pattern pattern = Pattern.compile("/v5.0/ocr");
            return pattern.matcher(srcPath).replaceFirst("");
        } else {
            return srcPath;
        }
  }

}

# DataControllerApi

All URIs are relative to *https://cloud-computing-simca.appspot.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMeasurementPollutantDataUsingGET**](DataControllerApi.md#getMeasurementPollutantDataUsingGET) | **GET** /api/data/v1/data | Get measurement data


<a name="getMeasurementPollutantDataUsingGET"></a>
# **getMeasurementPollutantDataUsingGET**
> MeasurementDataDTO getMeasurementPollutantDataUsingGET(measurementId, pollutantId)

Get measurement data

Fetch a measurement data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DataControllerApi;


DataControllerApi apiInstance = new DataControllerApi();
Integer measurementId = 56; // Integer | measurementId
Integer pollutantId = 56; // Integer | pollutantId
try {
    MeasurementDataDTO result = apiInstance.getMeasurementPollutantDataUsingGET(measurementId, pollutantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataControllerApi#getMeasurementPollutantDataUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **measurementId** | **Integer**| measurementId |
 **pollutantId** | **Integer**| pollutantId |

### Return type

[**MeasurementDataDTO**](MeasurementDataDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


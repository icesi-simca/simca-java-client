# MeasurementControllerApi

All URIs are relative to *https://cloud-computing-simca.appspot.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addValuesToMeasurementUsingPOST**](MeasurementControllerApi.md#addValuesToMeasurementUsingPOST) | **POST** /api/measurement/v1/measurement/{measurementId}/add-values | Add values to a measurement
[**createMeasurementUsingPOST**](MeasurementControllerApi.md#createMeasurementUsingPOST) | **POST** /api/measurement/v1/measurement | Create a measurement
[**deleteMeasurementUsingDELETE**](MeasurementControllerApi.md#deleteMeasurementUsingDELETE) | **DELETE** /api/measurement/v1/measurement/{measurementId} | Delete a measurement
[**editMeasurementUsingPUT**](MeasurementControllerApi.md#editMeasurementUsingPUT) | **PUT** /api/measurement/v1/measurement | Edit a measurement
[**getMeasurementByIdUsingGET**](MeasurementControllerApi.md#getMeasurementByIdUsingGET) | **GET** /api/measurement/v1/measurement/{measurementId} | Get measurement by id
[**getMeasurementUsingGET**](MeasurementControllerApi.md#getMeasurementUsingGET) | **GET** /api/measurement/v1/measurements | Get measurements (optional filters)


<a name="addValuesToMeasurementUsingPOST"></a>
# **addValuesToMeasurementUsingPOST**
> addValuesToMeasurementUsingPOST(measurementId, addValuesToMeasurementDTO)

Add values to a measurement

Add measured values of a given pollutant to a specified measurement.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MeasurementControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

MeasurementControllerApi apiInstance = new MeasurementControllerApi();
Integer measurementId = 56; // Integer | Id of the measuremet to add values to
AddValuesToMeasurementDTO addValuesToMeasurementDTO = new AddValuesToMeasurementDTO(); // AddValuesToMeasurementDTO | addValuesToMeasurementDTO
try {
    apiInstance.addValuesToMeasurementUsingPOST(measurementId, addValuesToMeasurementDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementControllerApi#addValuesToMeasurementUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **measurementId** | **Integer**| Id of the measuremet to add values to |
 **addValuesToMeasurementDTO** | [**AddValuesToMeasurementDTO**](AddValuesToMeasurementDTO.md)| addValuesToMeasurementDTO |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createMeasurementUsingPOST"></a>
# **createMeasurementUsingPOST**
> createMeasurementUsingPOST(addMeasurementDTO, details, authenticated)

Create a measurement

Create a measurement. Place and pollutants ids must already exist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MeasurementControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

MeasurementControllerApi apiInstance = new MeasurementControllerApi();
AddMeasurementDTO addMeasurementDTO = new AddMeasurementDTO(); // AddMeasurementDTO | addMeasurementDTO
Map<String, String> details = new HashMap(); // Map<String, String> | 
Boolean authenticated = true; // Boolean | 
try {
    apiInstance.createMeasurementUsingPOST(addMeasurementDTO, details, authenticated);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementControllerApi#createMeasurementUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addMeasurementDTO** | [**AddMeasurementDTO**](AddMeasurementDTO.md)| addMeasurementDTO |
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **authenticated** | **Boolean**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteMeasurementUsingDELETE"></a>
# **deleteMeasurementUsingDELETE**
> deleteMeasurementUsingDELETE(measurementId)

Delete a measurement

Delete a specified measurement.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MeasurementControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

MeasurementControllerApi apiInstance = new MeasurementControllerApi();
Integer measurementId = 56; // Integer | Id of the measurement to be deleted
try {
    apiInstance.deleteMeasurementUsingDELETE(measurementId);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementControllerApi#deleteMeasurementUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **measurementId** | **Integer**| Id of the measurement to be deleted |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="editMeasurementUsingPUT"></a>
# **editMeasurementUsingPUT**
> editMeasurementUsingPUT(measurementDTO)

Edit a measurement

Edit a specified measurement. All values must be valid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MeasurementControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

MeasurementControllerApi apiInstance = new MeasurementControllerApi();
MeasurementDTO measurementDTO = new MeasurementDTO(); // MeasurementDTO | measurementDTO
try {
    apiInstance.editMeasurementUsingPUT(measurementDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementControllerApi#editMeasurementUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **measurementDTO** | [**MeasurementDTO**](MeasurementDTO.md)| measurementDTO |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getMeasurementByIdUsingGET"></a>
# **getMeasurementByIdUsingGET**
> MeasurementDTO getMeasurementByIdUsingGET(measurementId)

Get measurement by id

Fetch a single measurement by a given id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MeasurementControllerApi;


MeasurementControllerApi apiInstance = new MeasurementControllerApi();
Integer measurementId = 56; // Integer | Id of the measurement to be fetched
try {
    MeasurementDTO result = apiInstance.getMeasurementByIdUsingGET(measurementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementControllerApi#getMeasurementByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **measurementId** | **Integer**| Id of the measurement to be fetched |

### Return type

[**MeasurementDTO**](MeasurementDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getMeasurementUsingGET"></a>
# **getMeasurementUsingGET**
> MeasurementsDTO getMeasurementUsingGET(date, time, place, pollutant)

Get measurements (optional filters)

Fetch a list of measurements. Measurements can be filtered by a combination of date, time, place and/or pollutant filters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MeasurementControllerApi;


MeasurementControllerApi apiInstance = new MeasurementControllerApi();
String date = "date_example"; // String | Date filter
String time = "time_example"; // String | Time filter
String place = "place_example"; // String | Place filter
String pollutant = "pollutant_example"; // String | Pollutant filter
try {
    MeasurementsDTO result = apiInstance.getMeasurementUsingGET(date, time, place, pollutant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MeasurementControllerApi#getMeasurementUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**| Date filter | [optional]
 **time** | **String**| Time filter | [optional]
 **place** | **String**| Place filter | [optional]
 **pollutant** | **String**| Pollutant filter | [optional]

### Return type

[**MeasurementsDTO**](MeasurementsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


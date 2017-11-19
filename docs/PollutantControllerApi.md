# PollutantControllerApi

All URIs are relative to *https://cloud-computing-simca.appspot.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPollutantUsingPOST**](PollutantControllerApi.md#createPollutantUsingPOST) | **POST** /api/pollutant/v1/pollutant | Create a pollutant
[**deletePollutantUsingDELETE**](PollutantControllerApi.md#deletePollutantUsingDELETE) | **DELETE** /api/pollutant/v1/pollutant/{idPollutant} | Delete a pollutant
[**editPollutantUsingPUT**](PollutantControllerApi.md#editPollutantUsingPUT) | **PUT** /api/pollutant/v1/pollutant | Edit a pollutant
[**getPollutantUsingGET**](PollutantControllerApi.md#getPollutantUsingGET) | **GET** /api/pollutant/v1/pollutant/{idPollutant} | Get a pollutant
[**getPollutantsUsingGET**](PollutantControllerApi.md#getPollutantsUsingGET) | **GET** /api/pollutant/v1/pollutants | Get all pollutants


<a name="createPollutantUsingPOST"></a>
# **createPollutantUsingPOST**
> createPollutantUsingPOST(addPollutantDTO)

Create a pollutant

Create a pollutant. Specify the correct measurement units

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PollutantControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

PollutantControllerApi apiInstance = new PollutantControllerApi();
AddPollutantDTO addPollutantDTO = new AddPollutantDTO(); // AddPollutantDTO | addPollutantDTO
try {
    apiInstance.createPollutantUsingPOST(addPollutantDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling PollutantControllerApi#createPollutantUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addPollutantDTO** | [**AddPollutantDTO**](AddPollutantDTO.md)| addPollutantDTO |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deletePollutantUsingDELETE"></a>
# **deletePollutantUsingDELETE**
> deletePollutantUsingDELETE(idPollutant)

Delete a pollutant

Delete a pollutant by a given pollutant id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PollutantControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

PollutantControllerApi apiInstance = new PollutantControllerApi();
Integer idPollutant = 56; // Integer | Pollutant id
try {
    apiInstance.deletePollutantUsingDELETE(idPollutant);
} catch (ApiException e) {
    System.err.println("Exception when calling PollutantControllerApi#deletePollutantUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idPollutant** | **Integer**| Pollutant id |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="editPollutantUsingPUT"></a>
# **editPollutantUsingPUT**
> editPollutantUsingPUT(pollutantDTO)

Edit a pollutant

Edit a pollutat with a given id. All values must be vaid

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PollutantControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

PollutantControllerApi apiInstance = new PollutantControllerApi();
PollutantDTO pollutantDTO = new PollutantDTO(); // PollutantDTO | pollutantDTO
try {
    apiInstance.editPollutantUsingPUT(pollutantDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling PollutantControllerApi#editPollutantUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pollutantDTO** | [**PollutantDTO**](PollutantDTO.md)| pollutantDTO |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getPollutantUsingGET"></a>
# **getPollutantUsingGET**
> PollutantDTO getPollutantUsingGET(idPollutant)

Get a pollutant

Get a pollutant by a given pollutant id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PollutantControllerApi;


PollutantControllerApi apiInstance = new PollutantControllerApi();
Integer idPollutant = 56; // Integer | Pollutant id
try {
    PollutantDTO result = apiInstance.getPollutantUsingGET(idPollutant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PollutantControllerApi#getPollutantUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idPollutant** | **Integer**| Pollutant id |

### Return type

[**PollutantDTO**](PollutantDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getPollutantsUsingGET"></a>
# **getPollutantsUsingGET**
> PollutantsDTO getPollutantsUsingGET()

Get all pollutants

Get all registered pollutants

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PollutantControllerApi;


PollutantControllerApi apiInstance = new PollutantControllerApi();
try {
    PollutantsDTO result = apiInstance.getPollutantsUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PollutantControllerApi#getPollutantsUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PollutantsDTO**](PollutantsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


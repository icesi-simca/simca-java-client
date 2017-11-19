# PlaceControllerApi

All URIs are relative to *https://cloud-computing-simca.appspot.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPlaceUsingPOST**](PlaceControllerApi.md#createPlaceUsingPOST) | **POST** /api/place/v1/place | Create a place
[**deleteLugarUsingDELETE**](PlaceControllerApi.md#deleteLugarUsingDELETE) | **DELETE** /api/place/v1/place/{idPlace} | Delete a place
[**editPlaceUsingPUT**](PlaceControllerApi.md#editPlaceUsingPUT) | **PUT** /api/place/v1/place | Edit a place
[**getPlaceUsingGET**](PlaceControllerApi.md#getPlaceUsingGET) | **GET** /api/place/v1/place/{idPlace} | Get a place
[**getPlacesUsingGET**](PlaceControllerApi.md#getPlacesUsingGET) | **GET** /api/place/v1/places | Get all places


<a name="createPlaceUsingPOST"></a>
# **createPlaceUsingPOST**
> createPlaceUsingPOST(addPlaceDTO)

Create a place

Create a place. Latitude and longitude will be shown in a map, make sure they match with the given address

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

PlaceControllerApi apiInstance = new PlaceControllerApi();
AddPlaceDTO addPlaceDTO = new AddPlaceDTO(); // AddPlaceDTO | addPlaceDTO
try {
    apiInstance.createPlaceUsingPOST(addPlaceDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaceControllerApi#createPlaceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addPlaceDTO** | [**AddPlaceDTO**](AddPlaceDTO.md)| addPlaceDTO |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteLugarUsingDELETE"></a>
# **deleteLugarUsingDELETE**
> deleteLugarUsingDELETE(idPlace)

Delete a place

Delete a place by a given id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

PlaceControllerApi apiInstance = new PlaceControllerApi();
Integer idPlace = 56; // Integer | Place id
try {
    apiInstance.deleteLugarUsingDELETE(idPlace);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaceControllerApi#deleteLugarUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idPlace** | **Integer**| Place id |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="editPlaceUsingPUT"></a>
# **editPlaceUsingPUT**
> editPlaceUsingPUT(placeDTO)

Edit a place

Edit a place with a given id. All values must be valid

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaceControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

PlaceControllerApi apiInstance = new PlaceControllerApi();
PlaceDTO placeDTO = new PlaceDTO(); // PlaceDTO | placeDTO
try {
    apiInstance.editPlaceUsingPUT(placeDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaceControllerApi#editPlaceUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **placeDTO** | [**PlaceDTO**](PlaceDTO.md)| placeDTO |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getPlaceUsingGET"></a>
# **getPlaceUsingGET**
> PlaceDTO getPlaceUsingGET(idPlace)

Get a place

Fetch a place by a given place id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlaceControllerApi;


PlaceControllerApi apiInstance = new PlaceControllerApi();
Integer idPlace = 56; // Integer | Place id
try {
    PlaceDTO result = apiInstance.getPlaceUsingGET(idPlace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaceControllerApi#getPlaceUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idPlace** | **Integer**| Place id |

### Return type

[**PlaceDTO**](PlaceDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getPlacesUsingGET"></a>
# **getPlacesUsingGET**
> PlacesDTO getPlacesUsingGET()

Get all places

Fetch all registered places

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PlaceControllerApi;


PlaceControllerApi apiInstance = new PlaceControllerApi();
try {
    PlacesDTO result = apiInstance.getPlacesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaceControllerApi#getPlacesUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PlacesDTO**](PlacesDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


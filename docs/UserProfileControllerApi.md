# UserProfileControllerApi

All URIs are relative to *https://cloud-computing-simca.appspot.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editUserProfileUsingPUT**](UserProfileControllerApi.md#editUserProfileUsingPUT) | **PUT** /api/userprofile/v1/profile | Edit a user profile
[**getUserProfileUsingGET**](UserProfileControllerApi.md#getUserProfileUsingGET) | **GET** /api/userprofile/v1/profile/{id} | Get user profile


<a name="editUserProfileUsingPUT"></a>
# **editUserProfileUsingPUT**
> editUserProfileUsingPUT(userProfileDTO)

Edit a user profile

Edit a user profile by a given user id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserProfileControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

UserProfileControllerApi apiInstance = new UserProfileControllerApi();
UserProfileDTO userProfileDTO = new UserProfileDTO(); // UserProfileDTO | userProfileDTO
try {
    apiInstance.editUserProfileUsingPUT(userProfileDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileControllerApi#editUserProfileUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userProfileDTO** | [**UserProfileDTO**](UserProfileDTO.md)| userProfileDTO |

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserProfileUsingGET"></a>
# **getUserProfileUsingGET**
> UserProfileDTO getUserProfileUsingGET(id)

Get user profile

Get a user profile by a given user id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserProfileControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

UserProfileControllerApi apiInstance = new UserProfileControllerApi();
String id = "id_example"; // String | User id
try {
    UserProfileDTO result = apiInstance.getUserProfileUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserProfileControllerApi#getUserProfileUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| User id |

### Return type

[**UserProfileDTO**](UserProfileDTO.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


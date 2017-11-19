# UserControllerApi

All URIs are relative to *https://cloud-computing-simca.appspot.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserUsingPOST**](UserControllerApi.md#addUserUsingPOST) | **POST** /api/user/v1/user | Create a user
[**checkEmailConfirmationStatusUsingGET**](UserControllerApi.md#checkEmailConfirmationStatusUsingGET) | **GET** /api/user/v1/confirm-email | Check an email confirmation status
[**checkPasswordResetRequestStatusUsingGET**](UserControllerApi.md#checkPasswordResetRequestStatusUsingGET) | **GET** /api/user/v1/password-reset | Check password reset request status
[**confirmEmailUsingPUT**](UserControllerApi.md#confirmEmailUsingPUT) | **PUT** /api/user/v1/confirm-email | Confirm email account
[**deleteUserUsingDELETE**](UserControllerApi.md#deleteUserUsingDELETE) | **DELETE** /api/user/v1/user | Delete a user
[**getUserByUsernameUsingGET**](UserControllerApi.md#getUserByUsernameUsingGET) | **GET** /api/user/v1/user/by-username/{userName} | Get user by username
[**getUserUsingGET**](UserControllerApi.md#getUserUsingGET) | **GET** /api/user/v1/user/{id} | Get user by id
[**getUsersUsingGET**](UserControllerApi.md#getUsersUsingGET) | **GET** /api/user/v1/users | Get all users
[**requestPasswordResetUsingPOST**](UserControllerApi.md#requestPasswordResetUsingPOST) | **POST** /api/user/v1/password-reset | Request a password reset
[**resetPasswordUsingPUT**](UserControllerApi.md#resetPasswordUsingPUT) | **PUT** /api/user/v1/password-reset | Reset user password


<a name="addUserUsingPOST"></a>
# **addUserUsingPOST**
> addUserUsingPOST(addUserDTO)

Create a user

Create a user. Username and email must be unique. Password must contain at least an uppercase letter, a number and between 8-20 characters

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
AddUserDTO addUserDTO = new AddUserDTO(); // AddUserDTO | addUserDTO
try {
    apiInstance.addUserUsingPOST(addUserDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#addUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addUserDTO** | [**AddUserDTO**](AddUserDTO.md)| addUserDTO |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="checkEmailConfirmationStatusUsingGET"></a>
# **checkEmailConfirmationStatusUsingGET**
> StateDTO checkEmailConfirmationStatusUsingGET(token)

Check an email confirmation status

Check the currnet state of an email confirmation request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
String token = "token_example"; // String | Email confirmation request token
try {
    StateDTO result = apiInstance.checkEmailConfirmationStatusUsingGET(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#checkEmailConfirmationStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Email confirmation request token | [optional]

### Return type

[**StateDTO**](StateDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="checkPasswordResetRequestStatusUsingGET"></a>
# **checkPasswordResetRequestStatusUsingGET**
> StateDTO checkPasswordResetRequestStatusUsingGET(token)

Check password reset request status

Check the current state of a password reset request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
String token = "token_example"; // String | Password reset request token
try {
    StateDTO result = apiInstance.checkPasswordResetRequestStatusUsingGET(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#checkPasswordResetRequestStatusUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Password reset request token | [optional]

### Return type

[**StateDTO**](StateDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="confirmEmailUsingPUT"></a>
# **confirmEmailUsingPUT**
> confirmEmailUsingPUT(token)

Confirm email account

Confirm an email account with a currently active email confirmation request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
String token = "token_example"; // String | Email confirmation request token
try {
    apiInstance.confirmEmailUsingPUT(token);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#confirmEmailUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Email confirmation request token | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUserUsingDELETE"></a>
# **deleteUserUsingDELETE**
> deleteUserUsingDELETE(id)

Delete a user

Delete a user by a given user id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

UserControllerApi apiInstance = new UserControllerApi();
String id = "id_example"; // String | Registered user id
try {
    apiInstance.deleteUserUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#deleteUserUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Registered user id | [optional]

### Return type

null (empty response body)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserByUsernameUsingGET"></a>
# **getUserByUsernameUsingGET**
> UserDTO getUserByUsernameUsingGET(userName)

Get user by username

Fetch a user by a given username

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

UserControllerApi apiInstance = new UserControllerApi();
String userName = "userName_example"; // String | Registered user username
try {
    UserDTO result = apiInstance.getUserByUsernameUsingGET(userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getUserByUsernameUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| Registered user username |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> UserDTO getUserUsingGET(id)

Get user by id

Fetch a user by a given user id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

UserControllerApi apiInstance = new UserControllerApi();
String id = "id_example"; // String | Registered user id
try {
    UserDTO result = apiInstance.getUserUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Registered user id |

### Return type

[**UserDTO**](UserDTO.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsersUsingGET"></a>
# **getUsersUsingGET**
> UsersDTO getUsersUsingGET()

Get all users

Fetch a list of all registered users

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2schema
OAuth oauth2schema = (OAuth) defaultClient.getAuthentication("oauth2schema");
oauth2schema.setAccessToken("YOUR ACCESS TOKEN");

UserControllerApi apiInstance = new UserControllerApi();
try {
    UsersDTO result = apiInstance.getUsersUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#getUsersUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UsersDTO**](UsersDTO.md)

### Authorization

[oauth2schema](../README.md#oauth2schema)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="requestPasswordResetUsingPOST"></a>
# **requestPasswordResetUsingPOST**
> requestPasswordResetUsingPOST(requestPasswordResetDTO)

Request a password reset

Request a password reset for a user with specified email. The email must be confirmed

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
RequestPasswordResetDTO requestPasswordResetDTO = new RequestPasswordResetDTO(); // RequestPasswordResetDTO | requestPasswordResetDTO
try {
    apiInstance.requestPasswordResetUsingPOST(requestPasswordResetDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#requestPasswordResetUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestPasswordResetDTO** | [**RequestPasswordResetDTO**](RequestPasswordResetDTO.md)| requestPasswordResetDTO |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="resetPasswordUsingPUT"></a>
# **resetPasswordUsingPUT**
> resetPasswordUsingPUT(resetPasswordDTO)

Reset user password

Reset a user password with a currently active password reset request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
ResetPasswordDTO resetPasswordDTO = new ResetPasswordDTO(); // ResetPasswordDTO | resetPasswordDTO
try {
    apiInstance.resetPasswordUsingPUT(resetPasswordDTO);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#resetPasswordUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resetPasswordDTO** | [**ResetPasswordDTO**](ResetPasswordDTO.md)| resetPasswordDTO |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


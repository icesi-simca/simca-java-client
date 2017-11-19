# TransactionControllerApi

All URIs are relative to *https://cloud-computing-simca.appspot.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTransactionUsingPOST**](TransactionControllerApi.md#createTransactionUsingPOST) | **POST** /api/transaction/v1/donation | Handle transaction


<a name="createTransactionUsingPOST"></a>
# **createTransactionUsingPOST**
> createTransactionUsingPOST(statePol, referenceSale, referencePol, sign, value, test)

Handle transaction

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TransactionControllerApi;


TransactionControllerApi apiInstance = new TransactionControllerApi();
Integer statePol = 56; // Integer | Transaction state
String referenceSale = "referenceSale_example"; // String | Transaction reference in SIMCA
String referencePol = "referencePol_example"; // String | Transaction reference in PayU
String sign = "sign_example"; // String | Signature
Double value = 3.4D; // Double | Transaction value
Boolean test = true; // Boolean | Test indicator
try {
    apiInstance.createTransactionUsingPOST(statePol, referenceSale, referencePol, sign, value, test);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionControllerApi#createTransactionUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statePol** | **Integer**| Transaction state | [optional]
 **referenceSale** | **String**| Transaction reference in SIMCA | [optional]
 **referencePol** | **String**| Transaction reference in PayU | [optional]
 **sign** | **String**| Signature | [optional]
 **value** | **Double**| Transaction value | [optional]
 **test** | **Boolean**| Test indicator | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DataControllerApi;

import java.io.File;
import java.util.*;

public class DataControllerApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://cloud-computing-simca.appspot.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataControllerApi* | [**getMeasurementPollutantDataUsingGET**](docs/DataControllerApi.md#getMeasurementPollutantDataUsingGET) | **GET** /api/data/v1/data | Get measurement data
*MeasurementControllerApi* | [**addValuesToMeasurementUsingPOST**](docs/MeasurementControllerApi.md#addValuesToMeasurementUsingPOST) | **POST** /api/measurement/v1/measurement/{measurementId}/add-values | Add values to a measurement
*MeasurementControllerApi* | [**createMeasurementUsingPOST**](docs/MeasurementControllerApi.md#createMeasurementUsingPOST) | **POST** /api/measurement/v1/measurement | Create a measurement
*MeasurementControllerApi* | [**deleteMeasurementUsingDELETE**](docs/MeasurementControllerApi.md#deleteMeasurementUsingDELETE) | **DELETE** /api/measurement/v1/measurement/{measurementId} | Delete a measurement
*MeasurementControllerApi* | [**editMeasurementUsingPUT**](docs/MeasurementControllerApi.md#editMeasurementUsingPUT) | **PUT** /api/measurement/v1/measurement | Edit a measurement
*MeasurementControllerApi* | [**getMeasurementByIdUsingGET**](docs/MeasurementControllerApi.md#getMeasurementByIdUsingGET) | **GET** /api/measurement/v1/measurement/{measurementId} | Get measurement by id
*MeasurementControllerApi* | [**getMeasurementUsingGET**](docs/MeasurementControllerApi.md#getMeasurementUsingGET) | **GET** /api/measurement/v1/measurements | Get measurements (optional filters)
*PlaceControllerApi* | [**createPlaceUsingPOST**](docs/PlaceControllerApi.md#createPlaceUsingPOST) | **POST** /api/place/v1/place | Create a place
*PlaceControllerApi* | [**deleteLugarUsingDELETE**](docs/PlaceControllerApi.md#deleteLugarUsingDELETE) | **DELETE** /api/place/v1/place/{idPlace} | Delete a place
*PlaceControllerApi* | [**editPlaceUsingPUT**](docs/PlaceControllerApi.md#editPlaceUsingPUT) | **PUT** /api/place/v1/place | Edit a place
*PlaceControllerApi* | [**getPlaceUsingGET**](docs/PlaceControllerApi.md#getPlaceUsingGET) | **GET** /api/place/v1/place/{idPlace} | Get a place
*PlaceControllerApi* | [**getPlacesUsingGET**](docs/PlaceControllerApi.md#getPlacesUsingGET) | **GET** /api/place/v1/places | Get all places
*PollutantControllerApi* | [**createPollutantUsingPOST**](docs/PollutantControllerApi.md#createPollutantUsingPOST) | **POST** /api/pollutant/v1/pollutant | Create a pollutant
*PollutantControllerApi* | [**deletePollutantUsingDELETE**](docs/PollutantControllerApi.md#deletePollutantUsingDELETE) | **DELETE** /api/pollutant/v1/pollutant/{idPollutant} | Delete a pollutant
*PollutantControllerApi* | [**editPollutantUsingPUT**](docs/PollutantControllerApi.md#editPollutantUsingPUT) | **PUT** /api/pollutant/v1/pollutant | Edit a pollutant
*PollutantControllerApi* | [**getPollutantUsingGET**](docs/PollutantControllerApi.md#getPollutantUsingGET) | **GET** /api/pollutant/v1/pollutant/{idPollutant} | Get a pollutant
*PollutantControllerApi* | [**getPollutantsUsingGET**](docs/PollutantControllerApi.md#getPollutantsUsingGET) | **GET** /api/pollutant/v1/pollutants | Get all pollutants
*TransactionControllerApi* | [**createTransactionUsingPOST**](docs/TransactionControllerApi.md#createTransactionUsingPOST) | **POST** /api/transaction/v1/donation | Handle transaction
*UserControllerApi* | [**addUserUsingPOST**](docs/UserControllerApi.md#addUserUsingPOST) | **POST** /api/user/v1/user | Create a user
*UserControllerApi* | [**checkEmailConfirmationStatusUsingGET**](docs/UserControllerApi.md#checkEmailConfirmationStatusUsingGET) | **GET** /api/user/v1/confirm-email | Check an email confirmation status
*UserControllerApi* | [**checkPasswordResetRequestStatusUsingGET**](docs/UserControllerApi.md#checkPasswordResetRequestStatusUsingGET) | **GET** /api/user/v1/password-reset | Check password reset request status
*UserControllerApi* | [**confirmEmailUsingPUT**](docs/UserControllerApi.md#confirmEmailUsingPUT) | **PUT** /api/user/v1/confirm-email | Confirm email account
*UserControllerApi* | [**deleteUserUsingDELETE**](docs/UserControllerApi.md#deleteUserUsingDELETE) | **DELETE** /api/user/v1/user | Delete a user
*UserControllerApi* | [**getUserByUsernameUsingGET**](docs/UserControllerApi.md#getUserByUsernameUsingGET) | **GET** /api/user/v1/user/by-username/{userName} | Get user by username
*UserControllerApi* | [**getUserUsingGET**](docs/UserControllerApi.md#getUserUsingGET) | **GET** /api/user/v1/user/{id} | Get user by id
*UserControllerApi* | [**getUsersUsingGET**](docs/UserControllerApi.md#getUsersUsingGET) | **GET** /api/user/v1/users | Get all users
*UserControllerApi* | [**requestPasswordResetUsingPOST**](docs/UserControllerApi.md#requestPasswordResetUsingPOST) | **POST** /api/user/v1/password-reset | Request a password reset
*UserControllerApi* | [**resetPasswordUsingPUT**](docs/UserControllerApi.md#resetPasswordUsingPUT) | **PUT** /api/user/v1/password-reset | Reset user password
*UserProfileControllerApi* | [**editUserProfileUsingPUT**](docs/UserProfileControllerApi.md#editUserProfileUsingPUT) | **PUT** /api/userprofile/v1/profile | Edit a user profile
*UserProfileControllerApi* | [**getUserProfileUsingGET**](docs/UserProfileControllerApi.md#getUserProfileUsingGET) | **GET** /api/userprofile/v1/profile/{id} | Get user profile


## Documentation for Models

 - [AddMeasurementDTO](docs/AddMeasurementDTO.md)
 - [AddPlaceDTO](docs/AddPlaceDTO.md)
 - [AddPollutantDTO](docs/AddPollutantDTO.md)
 - [AddUserDTO](docs/AddUserDTO.md)
 - [AddUserProfileDTO](docs/AddUserProfileDTO.md)
 - [AddValuesToMeasurementDTO](docs/AddValuesToMeasurementDTO.md)
 - [CountryDTO](docs/CountryDTO.md)
 - [ErrorDTO](docs/ErrorDTO.md)
 - [MeasurementDTO](docs/MeasurementDTO.md)
 - [MeasurementDataDTO](docs/MeasurementDataDTO.md)
 - [MeasurementsDTO](docs/MeasurementsDTO.md)
 - [PlaceDTO](docs/PlaceDTO.md)
 - [PlacesDTO](docs/PlacesDTO.md)
 - [PollutantDTO](docs/PollutantDTO.md)
 - [PollutantsDTO](docs/PollutantsDTO.md)
 - [RequestPasswordResetDTO](docs/RequestPasswordResetDTO.md)
 - [ResetPasswordDTO](docs/ResetPasswordDTO.md)
 - [StateDTO](docs/StateDTO.md)
 - [TimezoneDTO](docs/TimezoneDTO.md)
 - [UserDTO](docs/UserDTO.md)
 - [UserProfileDTO](docs/UserProfileDTO.md)
 - [UsersDTO](docs/UsersDTO.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2schema

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://cloud-computing-simca.appspot.com/oauth/token
- **Scopes**: 
  - global: Global authorization scope


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

pdgsimca@gmail.com


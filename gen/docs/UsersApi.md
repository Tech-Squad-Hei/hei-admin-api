# UsersApi

All URIs are relative to *https://api-dev.hei.school*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateStudents**](UsersApi.md#createOrUpdateStudents) | **PUT** /students | Create new students or update existing students
[**createOrUpdateTeachers**](UsersApi.md#createOrUpdateTeachers) | **PUT** /teachers | Create new teachers or update existing teachers
[**getManagerById**](UsersApi.md#getManagerById) | **GET** /managers/{id} | Get manager by identifier
[**getManagers**](UsersApi.md#getManagers) | **GET** /managers | Get all managers
[**getStudentById**](UsersApi.md#getStudentById) | **GET** /students/{id} | Get student by identifier
[**getStudents**](UsersApi.md#getStudents) | **GET** /students | Get all students
[**getTeacherById**](UsersApi.md#getTeacherById) | **GET** /teachers/{id} | Get teacher by identifier
[**getTeachers**](UsersApi.md#getTeachers) | **GET** /teachers | Get all teachers


<a name="createOrUpdateStudents"></a>
# **createOrUpdateStudents**
> List&lt;Student&gt; createOrUpdateStudents(student)

Create new students or update existing students

Update students when &#x60;id&#x60; are provided, create them otherwise.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    List<Student> student = Arrays.asList(null); // List<Student> | 
    try {
      List<Student> result = apiInstance.createOrUpdateStudents(student);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createOrUpdateStudents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **student** | [**List&lt;Student&gt;**](Student.md)|  |

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The created or updated students |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="createOrUpdateTeachers"></a>
# **createOrUpdateTeachers**
> List&lt;Teacher&gt; createOrUpdateTeachers(teacher)

Create new teachers or update existing teachers

Update teachers when &#x60;id&#x60; are provided, create them otherwise.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    List<Teacher> teacher = Arrays.asList(null); // List<Teacher> | 
    try {
      List<Teacher> result = apiInstance.createOrUpdateTeachers(teacher);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createOrUpdateTeachers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teacher** | [**List&lt;Teacher&gt;**](Teacher.md)|  |

### Return type

[**List&lt;Teacher&gt;**](Teacher.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The created or updated teachers |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getManagerById"></a>
# **getManagerById**
> Manager getManagerById(id)

Get manager by identifier

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Manager result = apiInstance.getManagerById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getManagerById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Manager**](Manager.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The identified manager |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getManagers"></a>
# **getManagers**
> List&lt;Manager&gt; getManagers(page, pageSize)

Get all managers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      List<Manager> result = apiInstance.getManagers(page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getManagers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;Manager&gt;**](Manager.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of managers, ordered by ref. |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getStudentById"></a>
# **getStudentById**
> Student getStudentById(id)

Get student by identifier

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Student result = apiInstance.getStudentById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getStudentById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Student**](Student.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The identified student |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getStudents"></a>
# **getStudents**
> List&lt;Student&gt; getStudents(page, pageSize, ref, firstName, lastName)

Get all students

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String ref = "ref_example"; // String | Filter students by ref, case is ignored
    String firstName = "firstName_example"; // String | Filter students by first name, case is ignored
    String lastName = "lastName_example"; // String | Filter students by last name, case is ignored
    try {
      List<Student> result = apiInstance.getStudents(page, pageSize, ref, firstName, lastName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getStudents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **ref** | **String**| Filter students by ref, case is ignored | [optional]
 **firstName** | **String**| Filter students by first name, case is ignored | [optional]
 **lastName** | **String**| Filter students by last name, case is ignored | [optional]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of students, ordered by ref. |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getTeacherById"></a>
# **getTeacherById**
> Teacher getTeacherById(id)

Get teacher by identifier

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Teacher result = apiInstance.getTeacherById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getTeacherById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Teacher**](Teacher.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The identified teacher |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |

<a name="getTeachers"></a>
# **getTeachers**
> List&lt;Teacher&gt; getTeachers(page, pageSize, ref, firstName, lastName)

Get all teachers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api-dev.hei.school");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    String ref = "ref_example"; // String | Filter teachers by ref, case is ignored
    String firstName = "firstName_example"; // String | Filter teachers by first name, case is ignored
    String lastName = "lastName_example"; // String | Filter teachers by last name, case is ignored
    try {
      List<Teacher> result = apiInstance.getTeachers(page, pageSize, ref, firstName, lastName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getTeachers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **ref** | **String**| Filter teachers by ref, case is ignored | [optional]
 **firstName** | **String**| Filter teachers by first name, case is ignored | [optional]
 **lastName** | **String**| Filter teachers by last name, case is ignored | [optional]

### Return type

[**List&lt;Teacher&gt;**](Teacher.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of teachers, ordered by ref. |  -  |
**400** | Bad request |  -  |
**403** | Forbidden |  -  |
**404** | Not found |  -  |
**429** | Too many requests to the API |  -  |
**500** | Internal server error |  -  |


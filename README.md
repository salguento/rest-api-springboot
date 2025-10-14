# Tasks REST API

## GET ListAll - http://localhost:8080/tasks/listall

Retrieves a list of all tasks from the API. Use this endpoint to fetch all existing tasks in the system.

## GET FindById - http://localhost:8080/tasks/findbyid/

Retrieves the details of a specific task by its unique ID.
Purpose: Fetches information for the task with ID 1 from the tasks API.
Endpoint: GET /tasks/1
Response: Returns the task object if found. If the task does not exist, a 404 status may be returned.
Usage: Use this request to view the details of a single task, such as its title, description, status, or other attributes.

## POST Add - http://localhost:8080/tasks/add

This is a POST request, submitting data to an API via the request body. This request submits JSON data, and the data is reflected in the response.
A successful POST request typically returns a 200 OK or 201 Created response code.

## PUT Update - http://localhost:8080/tasks/update/

Updates an existing task by its identifier. 
Purpose:
This PUT request is used to update the details of a specific task in the system.
Request Body:
Expects a JSON object with the following fields:
"task" (string): The updated description or title of the task.
"date" (string, format: YYYY-MM-DD): The updated date for the task.
"name" (string): The name of the person associated with the task.


Expected Response:
On success, returns HTTP 200 or 201 with the updated task details in the response body.
On failure, returns an appropriate error code and message.

## DELETE Delete - http://localhost:8080/tasks/delete/

Deletes a task by its ID. To use this endpoint, provide the task ID in the URL and include the task name in the request body as JSON. This operation will remove the specified task from the system if it exists.

*Documentação gerada automaticamente pelo Postman*

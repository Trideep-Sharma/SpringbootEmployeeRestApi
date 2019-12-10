# SpringbootEmployeeRestApi  <br />
github url : https://github.com/Trideep-Sharma/SpringbootEmployeeRestApi.git  <br />
aws server url : http://ec2-18-222-222-32.us-east-2.compute.amazonaws.com:8080/  <br />
  <br />
mongodb server portno : 27017  <br />
database name : employeedb  <br />
collection name : employee   <br />
  <br />
**1. Create an employee record**  <br />
    post request on  <br />
    http://ec2-18-222-222-32.us-east-2.compute.amazonaws.com:8080/create  <br />
<br />
    json format : it should be array of json object as we can create multiple employee in one post request  <br />
        [  <br />
	        {  <br />
		        "id" : "101",  <br />
		        "name" : "Trideep Sharma",   <br />
		        "designation" : "YTL"  <br />
	        },  <br />
            {  <br />
                "id" : "102",  <br />
                "name" : "XYZ",  <br />
                "designation" : "pqrs" <br /> 
            }  <br />
        ]  <br />
  <br />
**2. Get all employee record**  <br />
    get request on   <br />
    http://ec2-18-222-222-32.us-east-2.compute.amazonaws.com:8080/getall  <br />
  <br />
**3. Get employee record by id**  <br />
    get request on  <br />
    http://ec2-18-222-222-32.us-east-2.compute.amazonaws.com:8080/getbyid/{employee_id}  <br />
<br />
    example : http://ec2-18-222-222-32.us-east-2.compute.amazonaws.com:8080/getbyid/101  <br />
<br />
**4. Update employee record by id**  <br />
    put request on <br />
    http://ec2-18-222-222-32.us-east-2.compute.amazonaws.com:8080/update/{employee_id}  <br />
    with json object <br />
<br />
    example <br />
    http://ec2-18-222-222-32.us-east-2.compute.amazonaws.com:8080/update/101  <br />
    <br />
        {<br />
	        "id" : "101",  <br />
	        "name" : "Trideep",   <br />
	        "designation" : "YTL"  <br />
	    } <br />
<br />
**5. Delete employee record by id**  <br />
    delete request on  <br />
    http://ec2-18-222-222-32.us-east-2.compute.amazonaws.com:8080/delete/{employee_id}  <br />
     <br />
    example  <br /> 
    http://ec2-18-222-222-32.us-east-2.compute.amazonaws.com:8080/delete/101  <br />
<br />
**6. Delete all employee records**  <br />
    delete request on  <br />
    http://ec2-18-222-222-32.us-east-2.compute.amazonaws.com:8080/deleteall  <br />
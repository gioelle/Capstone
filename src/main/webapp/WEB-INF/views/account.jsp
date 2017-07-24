<!--  need a way to read from the file here to populate the account page based on the login used. -->
<%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.user.User" %>
 	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<% User u = (User) session.getAttribute("user"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Lobster" rel="stylesheet" type="text/css">
<style>
	table {
	    font-family: arial, sans-serif;
	    border-collapse: collapse;
	    width: 100%;
	    style: float-right;
	}
	
	td, th {
	    border: 1px solid #dddddd;
	    text-align: left;
	    padding: 8px;
	}
	
	tr {
	    background-color: #dddddd;
	}

	
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Home</title>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
		<div class="navbar-header">
			<button type="button" class="btn btn-info" data-toggle="collapse in" data-target="#navbar"></button>
				<div id="navbar" class="collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</div>
			Welcome to SwaProcity
		</div>
		<div id="navbar" class="navbar-colapse collapse"></div> 
		</div>
	</nav>
		<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class="jumbotron" style="font-family: lobster; background: url('file:///Users/Joelle.Fronzaglio/Downloads/Coins.jpg')">
		<div class="container">
		<h1>Hello, <% out.print(u.getFirstName()); %></h1>
		<p style="font-size: 35px; color: ab0fc8; text-shadow: 2px 2px #000000;">Thank you for investing in your community.</p>
		<p style="font-size: 35px; color: ab0fc8; text-shadow: 2px 2px #000000;">Please list services, items, or resources you have to share or are in need of.</p>
		</div>
	</div>
<!-- 	<div style="float-left" class="container">
	account menu actions here, each with a method...
	<div class="row">
	<div class="col-md-4">
	<h2>The options:</h2>
	<p></p>
	<form action="NewPostServlet" method="post">
	<button onclick="myFunction()" value="newAccount" type="button" class="btn btn-default">I need a new account.</button>
		<div class="dropdown">
	  <button onclick="myFunction()" class="dropbtn">I have something to offer!</button>
			  <div id="myDropdown" class="dropdown-content">
			    <p><a href=>ITEM (treasure)</a></p>
			    <p>SERVICE (I'm really good at this...)</p>
			    <p>RESOURCE (This this was expensive, let's share it)</p>
			   </div>
		</div>
	<div class="dropdown">
	  <button onclick="myFunction()" class="dropbtn">I need something someone else might have.</button>
			  <div id="myDropdown" class="dropdown-content">
			    <p>ITEM (treasure)</p>
			    <p>SERVICE (Is anyone out there good at this...?)</p>
			    <p>RESOURCE (Does anyone have this thing I could use?)</p>
			   </div>
		</div>	 -->

  <form action="/CreatePosting" method="POST">
  		<h3>Create a new posting here</h3>
  		<input type="radio" name="type" value="item" id="type"/>
		<label for="item">Item</label>
		<br>
		<input type="radio" name="type" value="service" id="type"/>
		<label for="service">Service</label>
		<br>
		<input type="radio" name="type" value="resource" id="type"/>
		<label for="resource">Resource</label>
		<br>
		
		<div class="form-group">
			<label for="title">Title</label>
			<input type="text" class="form-control" name="title" id="title" placeholder="Title">
		</div>
		<div class="form-group">
			<label for="description">Description</label>
			<input type="text" class="form-control" name="description" id="description" placeholder="A thorough description of your item, service, or sharble resource">
		</div>
		<div class="form-group">
			<label for="value">Value</label>
			<input type="text" class="form-control" name="value" id="value" placeholder="value">
		</div>

		<div class="form-group">
			<label for="photo">Upload Photo (please use at least one quality photo)</label>
			<input type="text" class="form-control" name="photo" id="photo" placeholder="url/fileAddr">
		</div>
		<div class="form-group">
			<label for="password">Photo</label>
			<input type="text" class="form-control" name="photo" id="photo" placeholder="url/fileAddr">
		</div>
		
  </form>
  
  
  
  <!-- TWO TABLES BELOW, ONE TO SHOW USER'S ACTIVE POSTINGS, ONE TO SHOW TRANSACTION HISTORY OF USER -->
  
 	<table style="float-left" class="table table-hover">
	<c:if test="${postings!= null}">
		<title>My Current Postings</title>
		<tr>
		    <th>Type</th>
		    <th>Title</th>
		    <th>Value</th>
		    <th>Instances Remaining</th>
		    <th>Edit/Delete</th>
		</tr>
	<c:forEach items="${postings}" var="attribute">
		<tr>
			<td>${attribute.type}</td>
			<td>${attribute.title}</td>
		 	<td>${attribute.value}</td>
		 	<td>${attribute.instances}</td>
		 	<td><a href=...>Edit</a>/<a href=...>Delete</a></td>
		</tr>
	</c:forEach>
		</c:if>
	</table>
	
 	<table style="float-right" class="table table-hover">
	<c:if test="${transactions!= null}">
		<title>My Past Transactions</title>
		<tr>
		    <th>Date</th>
		    <th>Type</th>
		    <th>Title</th>
		    <th>Value</th>
		    <th>User</th>
		</tr>
	<c:forEach items="${transactions}" var="attribute">
		<tr>
			<td>${attribute.date}</td>
			<td>${attribute.type}</td>
			<td>${attribute.title}</td>
		 	<td>${attribute.value}</td>
		 	<td>${attribute.user}</td>
		</tr>
	</c:forEach>
		</c:if>
	</table>
		
</body>
</html>
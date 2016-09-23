<%@ page import="com.Car" %>



<div class="fieldcontain ${hasErrors(bean: carInstance, field: 'color', 'error')} required">
	<label for="color">
		<g:message code="car.color.label" default="Color" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="color" required="" value="${carInstance?.color}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: carInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="car.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${carInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: carInstance, field: 'year', 'error')} required">
	<label for="year">
		<g:message code="car.year.label" default="Year" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="year" type="number" value="${carInstance.year}" required=""/>

</div>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html class="no-js" lang="pt">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastra Prestação</title>

<link rel="stylesheet" href="resources/css/foundation.css" />
<link rel="stylesheet" href="resources/css/style.css" />
<script src="resources/js/vendor/modernizr.js"></script>

<script type="text/javascript">
function submitWithAction(action) {
	document.forms[0].cmd.value = action;
	document.forms[0].submit();
}

</script>

</head>
<body>

	<div id="calculadoraId" class="panel radius">
		<html:form action="calculadora.do" method="post">
			<html:hidden property="cmd"/>
			<div class="row">
    		<div class="small-8 columns">
      		<div class="row">
			<div class="small-5 columns ">
				<label>PV
					<html:text styleId="pvId" property="pv" />
				</label>
				<label>Nº de meses
					<html:text styleId="nroMesesId" property="n" />
				</label>
				<label>Taxa Mensal
					<html:text styleId="txMensalId" property="i" />
				</label>
				<html:submit value="Calcular Parcela" styleClass="button" onclick="submitWithAction('calc');" />
				<html:submit value="Reset" styleClass="button alert" onclick="submitWithAction('reset');" />
				<label>PMT
					<html:text styleId="parcelaId" property="pmt" />
				</label>
			</div>
			</div>
			</div>
			</div>

		</html:form>
		
	</div>
	
	<script src="resources/js/vendor/jquery.js"></script>
    <script src="resources/js/foundation.min.js"></script>
    <script>
      $(document).foundation();
    </script>
	
<body>
</html>
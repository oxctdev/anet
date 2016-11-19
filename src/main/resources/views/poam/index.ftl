<#import "../application/layout.ftl" as application>
<@application.layout>
<h1>Listing Poams</h1>
Top Level POAMS:
<ul>
<#list list as poam>
	<li><a href="/poams/${poam.id}">${poam.shortName} - ${poam.longName!}</a></li>
</#list>
<a href="/people/new">[Create new Poam]</a>
</@application.layout>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
     <a href="homepage"><img src="https://www.fumettologica.it/wp-content/uploads/2019/01/casetta-adrian.jpg" height="150" /></a>
    <h1> Ecco i bicchieri di colore ${color} </h1>

    <#list glasses as glass>
        <div>${glass.getType()} - ${glass.getPrice()} &euro; </div>
    </#list>
    </body>
</html>
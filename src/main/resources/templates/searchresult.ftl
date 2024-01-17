<#ftl encoding="utf-8">
<!-- 
    Servlet che mi chiama: HomepageController
    attributi che mi passa: products, una lista di Glassware (sia tazze che bicchieri)
 -->
<!DOCTYPE html>
<html>
    <head>
        <title>Homepage</title>
    </head>
    <body>
        <#include "navbar.ftl"/>
        <h2 class="w3-center w3-khaki w3-text-teal w3-padding" style="margin:0px !important;">Your result for: ${searchKey}</h2>
        <div class="w3-row w3-margin-top" >
            <#list filtered as prod>
                <div class="w3-col m3 l3 w3-padding">
                    <div class="w3-card-4 w3-center ">

                        <header class="w3-container w3-teal">
                            <h1>${prod.getMaterial()}</h1>
                        </header>

                        <div class="w3-container">
                            <p>You can drink ${prod.getVolume()} ml of delicius bevarage from it</p>
                        </div>

                        <footer class="w3-container w3-khaki">
                            <h5>Price: ${prod.getPrice()} &euro;</h5>
                        </footer>
                    </div>
                </div>
            </#list>
        </div>
    </body>
</html>
<!DOCTYPE html>
<html>
    <head>
        <title>PRIMA FORM</title>
    </head>
    <body>
        <!--
            Quando la form verrà SUBMITTATA, vale a dire inviata, vale a dire l'utente clicca sul bottoncino apposito 
            Le caselline di testo, gli input, verranno convertiti in PARAMETRI
            Il nome del parametro sarà il name dell'input
            Il valore quello messo dall'utente
        -->
        <form action="seconda" method="get">
            <!--
                ATTRIBUTO action:"endpoint della servlet", qui dico di chiamare servlet con endpoint  "/seconda" 
                method: esistono più tipi di request, il method (o verbo) lo determina
                    noi fino ad ora abbiamo visto solo request GET
            -->
            <input name="a" type="number" />
            <input name="b" type="number" />
            <input type="submit" value="Invia form" />
        </form>
        <!-- Quando utente clicca bottone "Invia form" all'URL viene aggiunto ?a=10&b=20 , assumendo che nella prima casella abbia
              messo 10 e nella seconda 20
        -->

        <!-- 
            le form generano URL
            la prima parte è sempre uguale
            http://localhost:8080/base/actionDellaForm?parametriInput
            http://localhost:8080/base/seconda?a=10&b=20
        
        
         -->
        
    </body>
</html>
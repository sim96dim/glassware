<!-- 
    Servlet che mi chiama: HomepageController
    attributi che mi passa: cup   -   glass
 -->
<!DOCTYPE html>
<html>
    <head>
        <title>Homepage</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <h1> Benvenuto nel miglior negozio di CRISTALLERIA della città </h1>

        <h2>Affrettati, questi stanno per terminare </h2>

        <div> 
            <h4>Bicchiere Pregiatissimo</h4>
            <h5>Il nostro bicchiere di punta, composto di ${glass.getMaterial()} lavorato
            da impeccabili artigiani </h5>
            <h5>In grado di contenere ben ${glass.getVolume()} ml della tua bevanda preferita </h5>
            <h5>Può essere tuo per soli ${glass.getPrice()} &euro; </h5>
        </div>
           <div> 
            <h4>Tazza di design</h4>
            <h5>La nostra tazza di punta di punta, in splendida ${cup.getMaterial()} lavorata
            da impeccabili artigiani </h5>
            <h5>Dopo 79 ore di design, è stata creata questa immagine unicamente per lei</h5>
            <img src="${cup.getImg_url()}" height="200" />
            <h5>In grado di contenere ben ${cup.getVolume()} ml della tua bevanda preferita </h5>
            <h5>Può essere tuo per soli ${cup.getPrice()} &euro; </h5>
        </div>
    </body>
</html>
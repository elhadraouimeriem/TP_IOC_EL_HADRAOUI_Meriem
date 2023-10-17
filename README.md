<h1>Inversion de Contrôle et Injection des dépendances</h1>
<h2>Introduction</h2>
<p> Inversion de controle(IOC): Permet au développeur de se concentrer exclusivement sur
le code métier (exigences fonctionnelles),tandis que c'est le framework qui prend en 
charge le code technique (exigences techniques).<br>
L'injection de dépendances(DI): est une pratique qui contribue à créer des
applications plus flexibles, modulaires, et faciles à maintenir en séparant
la création et la gestion des dépendances du code métier principal. 
Elle est couramment utilisée dans le développement logiciel, en particulier 
dans les applications basées sur des cadres de travail tels que Spring (pour Java).
</p>
<h2>Enoncé</h2>
<ol>
  <li>Couche DAO
    <ul>
      <li>a- Créer l'interface</li>
      <li>b- Créer l'interface b</li>
    </ul>
  </li>
  <li>Couche Métier
    <ul>
     <li>a- Créer l'interface IMetier</li>
     <li>b-Créer l'implémentation de IMetier</li>
   </ul>
  </li>
  <li>Couche Présentation
    <p>Créer une application qui permet de faire l'injection des dépandences</p>
      <ul>
        <li>a- Instantiation statique</li>
        <li>b- Instantiation dynamique</li>
        <li>c-En utilisant Spring Framework
            <ul>
                <li>version XML</li>
                <li>version Annotation</li>
            </ul>
        </li>
        </ul>
  </li>
</ol>
<h2>Conception</h2>

/*!
  * Bootstrap v4.5.3 (https://getbootstrap.com/)
  * Copyright 2011-2020 The Bootstrap Authors (https://github.com/twbs/bootstrap/graphs/contributors)
  * Licensed under MIT (https://github.com/twbs/bootstrap/blob/main/LICENSE)
  */



const express= required ('express');
const app = express ();
app.use(express.static(_dirname + "/public/"));
app.listen('8080', function(){
	
	console.log("servidor web iniciando escuchando en puerto 3000. http://localhost:8080/");
	
})
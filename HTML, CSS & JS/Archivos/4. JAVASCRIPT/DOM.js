//El DOM (Document Object Model) es una interfaz de programacion  para documentos HTML, facilita la reprsentacion estructurada del documento y define como los programas acceden para mofidicar su estrcutura, estilo y contenido.

// console.log(document);

// console.log(document.head);
// console.log(document.title);

//getElementById: Devuelve una referencia al elemento por su ID.

// console.log(document.getElementById("tituloWeb"));
// console.log(document.getElementById("tituloWeb").textContent);

//Se utiliza cuando el script se coloca en el head
// document.addEventListener("DOMContentLoaded", () => {

    // console.log(document.getElementById("tituloWeb"));
    // console.log(document.getElementById("tituloWeb").textContent);
// })

//Defer: Otra opcion es el atributo "defer", el cual indica al navegador que no espere al script, en lugar de ello debe cargar el HTML, construir el DOM.

//querySelector: Devuelve el primer elemento del documento que coincida con el grupo especificado de selectores.

// console.log(document.querySelector("h1"));

// console.log(document.querySelectorAll(".text-danger"));

// console.log(document.querySelectorAll(".container .text-danger"));

// const h1 = document.getElementById("tituloWeb");

// console.log(h1.textContent);
// h1.textContent = "Nuevo texto desde JavaScript";
// h1.style.backgroundColor = "red";
// h1.style.color = "#fff";

//addEventListener: Registra un controlador de evento para un tipo de evento especifico en un elemento.

//appendChild: Inserta un nodo asi como el ultimo nodo hijo de este elemetno.

//hasAttribute: Verifica si el elemento tiene o no algun atributo.

//Eventos: En JS, la interaccion con el usuario se consigue mediante la captura de los eventos que este produce. Un evento es una accion del usuario.

// const boton = document.querySelector(".btn-primary");

// boton.addEventListener("click" , () => {
//     console.log('me diste click')
//     h1.textContent = "Texto desde JS"
//     h1.style.color = "blue"
// })

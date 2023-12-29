// const lista = document.getElementById("lista");

const arrayPaises = ["Peru", "Bolivia", "Colombia"];

// arrayPaises.forEach(pais => {
//     const li = document.createElement("li");
//     li.textContent = pais;
//     lista.appendChild(li);
// })

//createElement
// const li = document.createElement("li");
// li.textContent = "li desde js";
// console.log(li);

//AppendChild
// lista.appendChild(li);

//innerHTML

// arrayPaises.forEach(pais => {
//     lista.innerHTML += `<li>${pais}</li>`
// });

//Se genera un reflow: Ocurre cuando un navegador debe reprocresar o redibujar parte o la totalidad de una pagina web.

//Fragment: representa un objeto de documento que no tiene padre. Se genera de forma paralela y no hay reflow.
const fragment = document.createDocumentFragment();

// arrayPaises.forEach(pais => {
//     const li = document.createElement("li");
//     li.textContent = pais;
//     fragment.appendChild(li);
// })

// lista.appendChild(fragment);

arrayPaises.forEach(pais => {
    const newNode = document.createElement("newNode");
    newNode.textContent = pais;

    //firstChild
    const refNode = fragment.firstChild;
    
    //insertBefore
    fragment.insertBefore(newNode, refNode);
})

lista.appendChild(fragment);


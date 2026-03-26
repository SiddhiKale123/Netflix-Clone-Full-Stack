function login() {
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;

    fetch("http://localhost:8080/login", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            email: email,
            password: password
        })
    })
    .then(res => res.text())
   .then(data => {
    alert(data);

    if(data === "Login Successful") {
        loadMovies();  
    }
});
}


// LOAD MOVIES
fetch("http://localhost:8080/movies")
.then(res => res.json())
.then(data => {
    let container = document.getElementById("movies");

    data.forEach(movie => {
        let img = document.createElement("img");
        img.src = "https://via.placeholder.com/200x300?text=" + movie;
        container.appendChild(img);
    });
});
function loadMovies() {
    fetch("http://localhost:8080/movies")
    .then(res => res.json())
    .then(data => {
        let container = document.getElementById("movies");

        container.innerHTML = "";

        data.forEach(movie => {
            let div = document.createElement("div");
            div.innerText = movie;
            div.style.color = "white";
            div.style.margin = "10px";

            container.appendChild(div);
        });
    });
}
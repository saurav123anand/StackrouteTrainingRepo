const AllHotels = "http://localhost:8585/hotels/findall";
const byName = "http://localhost:8585/hotels/findbyname";

async function getHotels() {
    let response = await fetch(AllHotels);
    let responseData = await response.json()
    addCaraousel(responseData)
    getAllHotels(responseData)

}
getHotels();

function addCaraousel(data) {
    id = 1;
    for (let index = 0; index <= 2; index++) {
        let element = document.getElementById(index);
        element.src = data[index].url;
    }
}
const row = document.querySelector('.row');
function getAllHotels(data) {
    row.innerHTML = ``
    let htmlData = ""
    data.forEach((element, index) => {
        let html = `

       <div class="col-sm">
        <img src=${element.url} class="movie_image" id="${index}box1img">
        <h3>${element.name}</h3>
      </div>
           `
        htmlData += html
    });
    row.innerHTML = htmlData
}
let search = document.querySelector('.search');
let textbox = document.querySelector('.textbox')
search.addEventListener('click', () => {
    searchHotel();
})
async function searchHotel() {
    let response = await fetch(byName + "/" + textbox.value)
    if(response.status==404){
       console.log("no hotel find with name"+textbox.value)
    }

    else if (textbox.value) {
        let responseData = await response.json()
        console.log(responseData);
    }
    else {
        console.log("no data")
    }

} 



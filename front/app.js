function initialLoad() {
    const url = `http://${window.location.hostname}:30081`;

    fetch(url)
        .then(response => response.json())
        .then(data => {
            document.getElementById('product-list').innerText = JSON.stringify(data);
            console.log('Data received:', data);
        })
        .catch(error => {
            console.error('Error fetching data:', error);
        });
}

initialLoad();
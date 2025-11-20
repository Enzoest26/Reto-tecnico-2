function initialLoad() {

    fetch('/products')
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
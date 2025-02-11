const linkEntendaDiferenca = document.getElementById('entendaDiferenca');
const divExplicacao = document.getElementById('explicacao');

linkEntendaDiferenca.addEventListener('click', function(event) {
    event.preventDefault(); 

    if (divExplicacao.style.display === 'none' || divExplicacao.style.display === '') {
        divExplicacao.style.display = 'block'; 
    } else {
        divExplicacao.style.display = 'none'; 
    }
});
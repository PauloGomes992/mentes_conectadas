// Função para aplicar a máscara no CPF
document.addEventListener("DOMContentLoaded", function () {
  const campoCPF = document.getElementById("cpf");
  if (campoCPF) {
    campoCPF.addEventListener("input", mascaraCPF);
  }
});

function aplicarMascaraCPF(cpf) {
  cpf = cpf.replace(/\D/g, "");
  cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2");
  cpf = cpf.replace(/(\d{3})(\d)/, "$1.$2");
  cpf = cpf.replace(/(\d{3})(\d{1,2})$/, "$1-$2");

  return cpf;
}
function mascaraCPF(event) {
  let campoCPF = event.target;
  let cpf = campoCPF.value;
  campoCPF.value = aplicarMascaraCPF(cpf);
}

// Função para aplicar a máscara no telefone

document.addEventListener("DOMContentLoaded", function () {
  const campoTelefone = document.getElementById("telefone");
  if (campoTelefone) {
    campoTelefone.addEventListener("input", mascaraTelefone);
  }
});
function aplicarMascaraTelefone(telefone) {
  telefone = telefone.replace(/\D/g, "");
  telefone = telefone.replace(/^(\d{2})(\d)/, "($1) $2");
  telefone = telefone.replace(/(\d{5})(\d)/, "$1-$2");

  return telefone;
}

// Função para aplicar a máscara na data de nascimento

document.addEventListener("DOMContentLoaded", function () {
  const campoNascimento = document.getElementById("nascimento");
  if (campoNascimento) {
    campoNascimento.addEventListener("input", mascaraData);
  }
});
function mascaraTelefone(event) {
  let campoTelefone = event.target;
  let telefone = campoTelefone.value;

  telefone = telefone.replace(/\D/g, "").substring(0, 11);

  campoTelefone.value = aplicarMascaraTelefone(telefone);
}

function aplicarMascaraData(data) {
  data = data.replace(/\D/g, ""); // Remove caracteres não numéricos
  data = data.replace(/(\d{2})(\d)/, "$1/$2"); // Adiciona a primeira barra
  data = data.replace(/(\d{2})(\d)/, "$1/$2"); // Adiciona a segunda barra
  data = data.replace(/(\d{4})\d+?$/, "$1"); // Limita ao ano com 4 dígitos
  return data;
}

function mascaraData(event) {
  const campoData = event.target;
  let data = campoData.value;
  campoData.value = aplicarMascaraData(data);
}

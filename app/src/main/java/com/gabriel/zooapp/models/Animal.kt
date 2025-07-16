package com.gabriel.zooapp.models

data class Animal(
    val id: Int,
    val name: String,
    val species: String,
    val imageRes: Int,
    val description: String,
    val curiosities: String,
    var isFavorite: Boolean = false
)

val animalList = listOf(
    Animal(
        id = 1,
        name = "Cachorro",
        species = "Canis lupus familiaris",
        imageRes = com.gabriel.zooapp.R.drawable.ic_launcher_foreground,
        description = "O cão é um dos animais mais antigos domesticados pelo homem.",
        curiosities = "Os cães têm um olfato cerca de 40 vezes mais potente que o dos humanos."
    ),
    Animal(
        id = 2,
        name = "Gato",
        species = "Felis catus",
        imageRes = com.gabriel.zooapp.R.drawable.ic_launcher_foreground,
        description = "O gato doméstico é conhecido por sua agilidade e independência.",
        curiosities = "Gatos passam cerca de 70% do dia dormindo."
    ),
    Animal(
        id = 3,
        name = "Leão",
        species = "Panthera leo",
        imageRes = com.gabriel.zooapp.R.drawable.ic_launcher_foreground,
        description = "O leão é conhecido como o 'rei da selva' e vive em grandes grupos familiares.",
        curiosities = "O rugido de um leão pode ser ouvido a até 8 quilômetros de distância."
    ),
    Animal(
        id = 4,
        name = "Tigre",
        species = "Panthera tigris",
        imageRes = com.gabriel.zooapp.R.drawable.ic_launcher_foreground,
        description = "O tigre é o maior felino do mundo e é conhecido por suas listras únicas.",
        curiosities = "As listras de cada tigre são únicas, como as impressões digitais humanas."
    ),
    Animal(
        id = 5,
        name = "Elefante",
        species = "Loxodonta",
        imageRes = com.gabriel.zooapp.R.drawable.ic_launcher_foreground,
        description = "Os elefantes são os maiores mamíferos terrestres e são conhecidos por sua memória.",
        curiosities = "Elefantes podem se comunicar usando sons de baixa frequência que são inaudíveis para os humanos."
    ),
    Animal(
        id = 6,
        name = "Girafa",
        species = "Giraffa camelopardalis",
        imageRes = com.gabriel.zooapp.R.drawable.ic_launcher_foreground,
        description = "A girafa é o animal mais alto do mundo, graças ao seu longo pescoço.",
        curiosities = "Apesar do tamanho, o pescoço de uma girafa tem o mesmo número de vértebras que o de um humano."
    ),
    Animal(
        id = 7,
        name = "Macaco",
        species = "Primatas",
        imageRes = com.gabriel.zooapp.R.drawable.ic_launcher_foreground,
        description = "Os macacos são primatas conhecidos por sua inteligência e comportamento social.",
        curiosities = "Algumas espécies de macacos usam ferramentas para obter comida."
    )
)
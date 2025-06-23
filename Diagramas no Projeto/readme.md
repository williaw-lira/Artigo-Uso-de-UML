plantuml
@startuml
class Terreno {
  - tamanho: int
  - tipoSolo: String
  + prepararSolo(): void
}

class Arado extends Terreno {
  + arar(): void
  + plantar(): void
}

class Plantado extends Terreno {
  + plantar(): void
}

class Cultivado extends Terreno {
  + colher(): void
}

class Fazendeiro {
  - nome: String
  - idade: int
  + plantar(): void
  + colher(): void
}

class Animal {
  # nome: String
  # idade: int
  + emitirSom(): void
}

class Vaca extends Animal {
  + produzirLeite(): void
}

class Galinha extends Animal {
  + botarOvo(): void
}

class Equipamento {
  - tipo: String
  + usar(): void
}

class Trator extends Equipamento {
  + ararTerreno(): void
}

class Enxada extends Equipamento {
  + cavar(): void
}

Fazendeiro --> Terreno
Fazendeiro --> Equipamento
Fazendeiro --> Animal
@enduml


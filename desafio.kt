// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (val name: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.name} foi matriculado com suecsso na formação $nome!!")
    }
}

fun main() {
    // Criar alguns conteúdos educacionais
    val kotlinBasico = ConteudoEducacional("Kotlin Básico", 45)
    val kotlinAvancado = ConteudoEducacional("Kotlin Avançado", 60)
    val androidBasico = ConteudoEducacional("Android Básico")

    // Criar uma formação
    val formacaoKotlin = Formacao("Formação Kotlin", listOf(kotlinBasico, kotlinAvancado))

    // Criar alguns usuários
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")

    // Matricular os usuários na formação
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

    // Verificar os inscritos na formação
    println("Inscritos na formação ${formacaoKotlin.nome}: ${formacaoKotlin.inscritos.map { it.name }}")
}

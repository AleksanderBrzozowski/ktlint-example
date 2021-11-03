data class Foo(
    val bar1: String,
    val bar2: String // Missing trailing comma before ")"
)

fun main() {
    // Unexpected indentation (0) (should be 4)
println("Hello, World!")
}

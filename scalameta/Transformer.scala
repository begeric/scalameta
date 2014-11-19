import scala.meta._
import org.scalameta.adt._
//import scala.meta.syntactic.ast._

class Transformer extends TransformerBuilder[Tree]{
  def transform(tree: Tree): Tree = transformAdt
}
import scala.meta._
import org.scalameta.adt._

class Transformer extends TransformerBuilder[Tree]{
  def transform(tree: Tree): Tree = transformAdt
}
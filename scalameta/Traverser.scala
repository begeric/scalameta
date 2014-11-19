import scala.meta._
import org.scalameta.adt._

class Traverser extends TraverserBuilder[Tree]{
	def traverse(tree: Tree):Unit = traverseAdt
}
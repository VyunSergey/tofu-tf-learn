import cats.effect.{ExitCode, IO, IOApp}
import scala.concurrent.duration._

object Main extends IOApp{
  def run(args: List[String]): IO[ExitCode] = for {
    _ <- IO.pure(println("Hello World!"))
    _ <- IO.sleep(5.second)
    _ <- IO.pure(println("Goodbye World!"))
  } yield ExitCode.Success
}

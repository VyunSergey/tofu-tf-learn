import cats.Monad
import tofu.common.Console
import tofu.syntax.console._
import tofu.syntax.monadic._
import tofu.syntax.timer._
import cats.effect.{ExitCode, IO, IOApp, Timer}

import scala.concurrent.duration._

object Main extends IOApp {
  def run(args: List[String]): IO[ExitCode] =
    program[IO] *> IO.pure(ExitCode.Success)

  def program[F[_]: Monad: Console: Timer]: F[Unit] = for {
    _ <- putStrLn("Hello World!")
    _ <- sleep(5.second)(Timer[F])
    _ <- putStrLn("Goodbye World!")
  } yield ()
}

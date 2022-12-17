package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson>list = new ArrayList<>();

		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("\nDados da " + i + "ª aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Título: ");
			sc.nextLine();
			String titulo = sc.nextLine();

			if (resp == 'c' || resp == 'C') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos:");
				int duracao = sc.nextInt();
				list.add(new Video(titulo, url, duracao));
			} else {
			System.out.print("Descrição: ");
			String descrption = sc.nextLine();
			System.out.print("Quantidade de questões: ");
			int numberQuestions = sc.nextInt();
			list.add(new Task(titulo, descrption, numberQuestions));
			}
		}
		System.out.println();

		int soma = 0;
		
		for (Lesson lesson : list) {
			double duration = lesson.duration();
			soma += duration;
		}
		
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + soma + " segundos");
		
		
		sc.close();
	}

}

package br.ph.readers;

import java.lang.reflect.Field;

import com.github.drapostolos.typeparser.TypeParser;

import br.ph.annotations.Position;

public class Reader {
	
	public static <T> void parse (String line, T instance) throws IllegalArgumentException, IllegalAccessException {
		TypeParser parser = TypeParser.newBuilder().build();
		
		for (Field field : instance.getClass().getDeclaredFields()) {
			Position posicao = field.getAnnotation(Position.class);
			if (posicao != null) {
				String value = line.substring(posicao.begin(), posicao.end());
				
				field.setAccessible(true);
				field.set(instance, parser.parse(value, posicao.type()));
			}
		}
	}
	
}

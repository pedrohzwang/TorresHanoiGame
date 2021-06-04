package game;

import java.util.HashMap;
import java.util.Map;

public enum Pilhas {
    ORIGEM(1),
    AUX(2),
    DESTINO(1);

    private Integer id;

    Pilhas(Integer id) {
        this.id = id;
    }

    protected Integer getId() {
        return id;
    }

    static protected Pilhas getPilha(Integer id){
        return PILHAS_MAP.get(id);
    }

    private static final Map<Integer, Pilhas> PILHAS_MAP = new HashMap<>();

    static {
        for (Pilhas pilha : Pilhas.values()){
            PILHAS_MAP.put(pilha.getId(), pilha);
        }
    }
}

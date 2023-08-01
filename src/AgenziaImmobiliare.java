
import java.util.ArrayList;
import java.util.List;

    public class AgenziaImmobiliare {
        private List<Immobile> immobili;

        public AgenziaImmobiliare() {
            immobili = new ArrayList<>();
        }

        public void aggiungiImmobile(Immobile immobile) {
            immobili.add(immobile);
        }

        public Immobile ricercaImmobile(String codice) {
            for (Immobile immobile : immobili) {
                if (immobile.getCodice().equals(codice)) {
                    return immobile;
                }
            }
            return null;
        }
        public Immobile immobileConMaxPersoneInteressate() {
            if (immobili.isEmpty()) {
                return null;
            }

            Immobile immobileMax = immobili.get(0);
            int maxNumPersoneInteressate = immobileMax.getNumPersoneInteressate();

            for (Immobile immobile : immobili) {
                int numPersoneInteressate = immobile.getNumPersoneInteressate();
                if (numPersoneInteressate > maxNumPersoneInteressate) {
                    immobileMax = immobile;
                    maxNumPersoneInteressate = numPersoneInteressate;
                }
            }

            return immobileMax;
        }
    }


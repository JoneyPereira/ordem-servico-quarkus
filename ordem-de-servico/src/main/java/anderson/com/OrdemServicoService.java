package anderson.com;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@ApplicationScoped
public class OrdemServicoService {

    public List<OrdemServico> list(){
        return OrdemServico.listAll();
    }


    @Transactional
    public void novaOrdemServico(InserirOrdemServicoDTO inserirOrdemServicoDTO){
        OrdemServico ordenServico = new OrdemServico();
        ordenServico.descricao = "Realizar troca de impressora.";
        ordenServico.data = LocalDate.of(2021, 5, 12) ;
        ordenServico.categoria = "OUTRAS";
        ordenServico.persist();
    }
}

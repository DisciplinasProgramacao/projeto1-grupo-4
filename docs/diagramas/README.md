# Diagramas de classe
Coloque aqui todas as versões do seu diagrama de classes. Cada versão deve começar com um número de dois dígitos, na ordem crescente.

## Segunda Versão 02:

![image](https://user-images.githubusercontent.com/90854583/186232616-da5fee70-ee93-4b33-8585-77b2d556224e.png)

![image](https://user-images.githubusercontent.com/90854173/186149622-92edafc6-59d7-4c6e-a479-e50b2786207c.png)

![image](https://user-images.githubusercontent.com/109962972/186505264-053a84e8-046f-4778-be6a-727ff10145c5.jpeg)


## Primeira Versão 01:

| Horario |              
| ---- |
| - horario : String |
| - hora : int |
| - minuto : int |
||
| Horario( horario : String)  |
| validaHorario( horario : String) : boolean |
| formatarHorario( horario : String) : void |

| Compromisso |              
| ---- |
| - nome : String |
| - tipo : String |
| - horario : Horario |
||
| + Compromisso(nome : String, tipo : String) |
| + Compromisso(nome : String, tipo : String, horario : String ) |
| + getHorario() : Horario |

| Data |              
| ---- |
| - anoAtual : int |
| - diasDoMes : int [ ]|
| - data : String |
| - dia : int |
| - mes : int |
| - ano : int |
| - compromissos : arrayList<Compromisso> |
||
| + Data(data : String )|
| - validaData(data : String ) : boolean |
| - anoBissexto(ano : int ) : boolean |
| + addCompromisso(compromisso : Compromisso): void |
| - procuraComprimisso(compromissoNome : String) : Compromisso |

| Calendario |              
| ---- |
| - datas : arrayList<Data> |
||
| + GetCompromissosDoDia(data : String ): arrayList<Compromisso>|
| + addCompromissoPeriodico(data : String, compromissoNome : String ,intervaloEntreDias : int, nrDeVezes : int ) : void|
| - validaData(data : String ) : boolean |
| + addCompromisso(data : String, intervaloEntreDias : int, nrDeVezes : int ) : void|
| + procuraComprimisso(compromissoNome : String) : Data |


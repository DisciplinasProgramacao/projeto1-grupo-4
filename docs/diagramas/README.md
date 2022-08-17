# Diagramas de classe
Coloque aqui todas as versões do seu diagrama de classes. Cada versão deve começar com um número de dois dígitos, na ordem crescente.

## Primeira versão:

#### 01

| Horario |              
| ---- |
| - horario : String |
| - hora : int |
| - minuto : int |
||
| Horario( horario : String)  |
| validaHorario( horario : String) : boolean |
| formatarHorario( horario : String) : void |

#### 02

| Compromisso |              
| ---- |
| - nome : String |
| - tipo : String |
| - horario : Horario |
||
| + Compromisso(nome : String, tipo : String) |
| + Compromisso(nome : String, tipo : String, horario : String ) |
| + getHorario() : Horario |

#### 03

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

#### 04

| Calendario |              
| ---- |
| - datas : arrayList<Data> |
||
| + GetCompromissosDoDia(data : String ): arrayList<Compromisso>|
| + addCompromissoPeriodico(data : String, compromissoNome : String ,intervaloEntreDias : int, nrDeVezes : int ) : void|
| - validaData(data : String ) : boolean |
| + addCompromisso(data : String, intervaloEntreDias : int, nrDeVezes : int ) : void|
| + procuraComprimisso(compromissoNome : String) : Data |


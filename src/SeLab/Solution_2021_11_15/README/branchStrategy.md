# Git Branch 전략

***

* 여러 개발자가 하나의 저장소를 사용하는 환경에서 저장소를 효과적으로 이용하기 위한` Work-Flow`

***

## TABLE

* ### [GitHub-Flow](#gitHub-flow)
* ### [GitHub-Flow 의 장단점](gitHub-flow-의-장단점)
* ### [Git-Flow](#git-flow)
* ### [Git-Flow 의 장단점](git-flow-의-장단점)
* ### [GitLab-Flow](#gitlab-flow)
* ### [GitLab-Flow 의 장단점](#gitlab-flow-의-장단점)
***
## 📃 GitHub-Flow
***
* 1개의 `master` 브랜치, 1개의` feature` 브랜치 로 이루어져있다. `PR(PUll-REQUEST)` 을 활용 한 branch 전략이다.
* 


###1. 브랜치는 어느 상황이든 배포가 가능하다.
![](C:\Users\CKIRUser\Downloads\branch생성.png)
 
 * `master branch`는 항상 최신상태이며 stable 상대로 `product`에 배포된다.!
 * 라이브 서버에 바로 업데이트 되는 브랜치 이기에` 엄격한 검증(review / test)`이 필요   
   -> **빌드가 실패하거나 배포 시 에러가 발생하지 않아야한다.**
 * `merge` 를 진행하기전 브랜치 에 push 하여 테스트 진행 필요
 * 
###2. master에서 새로운일을 시작하기위해 브랜치를 만들때 이름을 명확히 한다.
![](C:\Users\CKIRUser\Downloads\개발커밋.png)
* 브랜치는 항상 main 으로부터 만든다.
* [Git-Flow](#git-flow)와 다르게 `develop`  branch 가 존재하지 않는다.
* 새로운 기능 추가 | 버그해결 위한 브랜치는 어떤일을 하는지 자세히 작성필요   
* `Commit Comment` 를  확실하게 하자!

###3. [Remote Repository](#3-remote-repository)  브랜치로 수시로 [push](#push) 하자.
![](C:\Users\CKIRUser\Downloads\PR생성.png)
* 항상 `Remote Repository` 에 자신이 하고 있는 작업을 올려 다른 사람들도 확인 하도록함. (BACKUP)

###4. FeedBack | 도움 필요할때 || [merge](#merge) 준비 완료시 [PULL REQUEST](#pull-request) 생성
![](C:\Users\CKIRUser\Downloads\review토의.png)
* `merge` 가 이루어 지면 live 서버에 배포되기 때문에 상세히 이루어져야함.
* 자신의 코드를 PR 요청하여 **항상** 리뷰 받고 수정 후 `master branch` 로 반영 요구 

###5.TEST
![](C:\Users\CKIRUser\Downloads\test.png)
* 바로 product 로 반영 되기 때문에 충분한 논의 필요! 
* review 를 통한 배포버전을 테스트한다 <small>(문제 발생시 `master` 내용을 초기화)</small>

###6.master로 merge되고 push 되었을 때는 즉시 배포 되어야한다!!
![](C:\Users\CKIRUser\Downloads\최종merge.png)
* `mater`로 `merge`가 일어나면 자동으로 배포 되도록 설정 필요
***
##GitHub-Flow 의 장단점
### GOOD
* 흐름이 간단하여 누구나 손쉽게 이해하고 접근할 수 있다. (심지어는 git을 사용하지 않은 개발자도..)
* Github 에서 제공하는 [이슈](#isuue)를 활용할 수 있다.
* 배포가 빈번한 [MSA 환경](#MSA)등 민첩한 [CI/CD](#CI/CD) 배포 전략을 수립하기 용이하다.
* 소규모 팀과 웹 애플리케이션 프로젝트 진행하기 적합하다.
* 구글의 대부분의 프로젝트가 사용하는 기법!

### BAD
* 동시에 여러 버전의 소스를 지원하지 않는다.
* Review 의 중요성이 매우 높기 때문에 INFRA 관점의 이해도가 높은 리더가 반드시 존재해야함.
* Develop 브랜치가 존재하지 않아 운영 버그에 취약하다.
***
##Git-Flow


##Git-Flow 의 장단점
##GitLab-Flow
##GitLab-Flow 의 장단점





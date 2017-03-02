# git版本控制系统学习笔记
 - git add
向本地仓库添加文件
 - git commit
 向本地仓库提交
 - git push
 提交到本地仓库
 - git status
 查看仓库状态
 - git reset
 回退到某个版本
 - git reflog
 查看日志
 - commit id
 提交的id
- git diff
查看区别
 - HEAD
 指向当前版本
第一步是用git add把文件添加进去，实际上就是把文件修改添加到暂存区；
第二步是用git commit提交更改，实际上就是把暂存区的所有内容提交到当前分支。
需要提交的文件修改通通放到暂存区，然后，一次性提交暂存区的所有修改。

当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令git checkout -- file。

当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，分两步，第一步用命令git reset HEAD file，就回到了场景1，第二步按场景1操作。
已经提交了不合适的修改到版本库时，想要撤销本次提交，参考版本回退一节，不过前提是没有推送到远程库。

## Git分支

- git branch
查看分支
当前分支名称前面有 '*' 号
- git branch <name>
创建分支
-git checkout <name>
切换分支
- git checkout -b <name>
创建+切换分支
- git merge <name>
合并某分支到当前分支
- git branch -d <name>
删除分支

- git log --graph
命令可以看到分支合并图。
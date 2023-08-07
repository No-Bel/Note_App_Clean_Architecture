package com.example.cleanarchitecturenoteapp.feature_note.domain.use_cases

data class NoteUseCases(
    val getNoteUseCases: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase,
    val getNoteUseCase: GetNoteUseCase
)